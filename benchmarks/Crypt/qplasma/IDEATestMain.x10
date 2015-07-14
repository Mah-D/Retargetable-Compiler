public class IDEATestMain {
	public static void main(String[] args) {
{
			Timer tmr = new Timer();
			int count = 0;
			tmr.start(count);
			new IDEATest().run();
			tmr.stop(count);
			System.out.println("Wall-clock time for crypt: " + tmr.readTimer(count) + " secs");
		}
	}
}

class IDEATest {
	public static final int array_rows = 32000;
	public byte[:rank==1] plain1;
	public byte[:rank==1] crypt1;
	public byte[:rank==1] plain2;
	public int value[:rank==1] userkey;
	public int value[:rank==1] ZR;
	public int value[:rank==1] DKR;
	public IDEATest() {
		buildTestData();
		final dist(:rank==1) D = (dist(:rank==1))dist.factory.block([0 : array_rows - 1]);
		plain1 = new byte[D](point(:rank==1)p) {
			return (byte)p[0];
		};
		crypt1 = new byte[D];
		plain2 = new byte[D];
	}
	public void run() {
		kernel();
		validate();
	}
	public void kernel() {
		Do();
	}
	public void validate() {
		final byte[:rank==1] p1 = plain1;
		final byte[:rank==1] c1 = crypt1;
		final byte[:rank==1] p2 = plain2;
		finish
			ateach(point(:rank==1) pt : plain1.distribution) {
				if(p1[pt] != p2[pt]) {
					System.out.println("Validation failed");
					System.out.println("Original Byte " + pt + " = " + p1[pt]);
					System.out.println("Encrypted Byte " + pt + " = " + c1[pt]);
					System.out.println("Decrypted Byte " + pt + " = " + p2[pt]);
					throw new RuntimeException("Validation failed");
				}
			}
	}
	public void Do() {
		final byte[:rank==1] p1 = plain1;
		final byte[:rank==1] c1 = crypt1;
		final byte[:rank==1] p2 = plain2;
		final int value[:rank==1] fzr = ZR;
		final int value[:rank==1] fdkr = DKR;
		finish
			ateach(point(:rank==1) pt : dist.UNIQUE) {
				cipher_idea(p1, c1, fzr);
				cipher_idea(c1, p2, fdkr);
			}
	}
	public void buildTestData() {
		final Random rndnum = new Random(136506717L);
		final region(:rank==1) rUserKey = [0 : 7];
		final dist(:rank==1) dUserKey = rUserKey -> here;
		final int[:rank==1] tUserKey = new int[dUserKey];
		for(point(:rank==1) pt : rUserKey) {
			tUserKey[pt] = (short)rndnum.nextInt();
		}
		final int value[:rank==1] tempuserkey = (int value[:rank==1])new int value[rUserKey](point(:rank==1)pt) {
			return tUserKey[pt];
		};
		userkey = tempuserkey;
		final int value[:rank==1] tempZR = calcEncryptKey(tempuserkey);
		ZR = tempZR;
		calcDecryptKey(tempZR);
	}
	private int value[:rank==1] calcEncryptKey(final int value[:rank==1] auserkey) {
		int j = 0;
		final region(:rank==1) rZ = [0 : 51];
		final dist(:rank==1) dZ = rZ -> here;
		final int[:rank==1] Z = new int[dZ];
		for(point(:rank==1) i : [0 : 7]) {
			Z[i] = auserkey[i] & 0xffff;
		}
		for(point(:rank==1) i : [8 : 51]) {
			j = i[0] % 8;
			if(j < 6) {
				Z[i] = ((Z[i + [-7]] >>> 9) | (Z[i + [-6]] << 7)) & 0xFFFF;
				continue;
			}
			if(j == 6) {
				Z[i] = ((Z[i + [-7]] >>> 9) | (Z[i + [-14]] << 7)) & 0xFFFF;
				continue;
			}
			Z[i] = ((Z[i + [-15]] >>> 9) | (Z[i + [-14]] << 7)) & 0xFFFF;
		}
		return (int value[:rank==1])new int value[rZ](point(:rank==1)pt) {
			return Z[pt];
		};
	}
	private void calcDecryptKey(final int value[:rank==1] aZR) {
		int j = 0;
		int k = 0;
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		final region(:rank==1) rDK = [0 : 51];
		final dist(:rank==1) dDK = rDK -> here;
		final int[:rank==1] DK = new int[dDK];
		final int value[:rank==1] Z = aZR;
		t1 = inv(Z[0]);
		t2 = -Z[1] & 0xffff;
		t3 = -Z[2] & 0xffff;
		DK[51] = inv(Z[3]);
		DK[50] = t3;
		DK[49] = t2;
		DK[48] = t1;
		j = 47;
		k = 4;
		for(point(:rank==1) i : [0 : 6]) {
			t1 = Z[k++];
			DK[j--] = Z[k++];
			DK[j--] = t1;
			t1 = inv(Z[k++]);
			t2 = -Z[k++] & 0xffff;
			t3 = -Z[k++] & 0xffff;
			DK[j--] = inv(Z[k++]);
			DK[j--] = t2;
			DK[j--] = t3;
			DK[j--] = t1;
		}
		t1 = Z[k++];
		DK[j--] = Z[k++];
		DK[j--] = t1;
		t1 = inv(Z[k++]);
		t2 = -Z[k++] & 0xffff;
		t3 = -Z[k++] & 0xffff;
		DK[j--] = inv(Z[k++]);
		DK[j--] = t3;
		DK[j--] = t2;
		DK[j--] = t1;
		DKR = (int value[:rank==1])new int value[rDK](point(:rank==1)i) {
			return DK[i];
		};
	}
	private void cipher_idea(final byte[:rank==1] text1, final byte[:rank==1] text2, final int value[:rank==1] key) {
		if(text1.region.size() % (8 * place.MAX_PLACES) != 0) {
			throw new RuntimeException("Invalid number of places for the distribution size");
		}
		for(point(:rank==1) i : text1.distribution | here) {
			if(i[0] % 8 == 0) {
				point(:rank==1) i1 = i;
				point(:rank==1) i2 = i;
				int ik = 0;
				int x1 = 0;
				int x2 = 0;
				int x3 = 0;
				int x4 = 0;
				int t1 = 0;
				int t2 = 0;
				int r = 0;
				ik = 0;
				r = 8;
				x1 = text1[i1] & 0xff;
				i1 = i1 + [1];
				x1 = x1 | (text1[i1] & 0xff) << 8;
				i1 = i1 + [1];
				x2 = text1[i1] & 0xff;
				i1 = i1 + [1];
				x2 = x2 | (text1[i1] & 0xff) << 8;
				i1 = i1 + [1];
				x3 = text1[i1] & 0xff;
				i1 = i1 + [1];
				x3 = x3 | (text1[i1] & 0xff) << 8;
				i1 = i1 + [1];
				x4 = text1[i1] & 0xff;
				i1 = i1 + [1];
				x4 = x4 | (text1[i1] & 0xff) << 8;
				i1 = i1 + [1];
				do {
					x1 = (int)((long)x1 * key[ik++] % 0x10001L & 0xffff);
					x2 = x2 + key[ik++] & 0xffff;
					x3 = x3 + key[ik++] & 0xffff;
					x4 = (int)((long)x4 * key[ik++] % 0x10001L & 0xffff);
					t2 = x1 ^ x3;
					t2 = (int)((long)t2 * key[ik++] % 0x10001L & 0xffff);
					t1 = t2 + (x2 ^ x4) & 0xffff;
					t1 = (int)((long)t1 * key[ik++] % 0x10001L & 0xffff);
					t2 = t1 + t2 & 0xffff;
					x1 = x1 ^ t1;
					x4 = x4 ^ t2;
					t2 = t2 ^ x2;
					x2 = x3 ^ t1;
					x3 = t2;
				} while(--r != 0);
				x1 = (int)((long)x1 * key[ik++] % 0x10001L & 0xffff);
				x3 = x3 + key[ik++] & 0xffff;
				x2 = x2 + key[ik++] & 0xffff;
				x4 = (int)((long)x4 * key[ik++] % 0x10001L & 0xffff);
				text2[i2] = (byte)x1;
				i2 = i2 + [1];
				text2[i2] = (byte)(x1 >>> 8);
				i2 = i2 + [1];
				text2[i2] = (byte)x3;
				i2 = i2 + [1];
				text2[i2] = (byte)(x3 >>> 8);
				i2 = i2 + [1];
				text2[i2] = (byte)x2;
				i2 = i2 + [1];
				text2[i2] = (byte)(x2 >>> 8);
				i2 = i2 + [1];
				text2[i2] = (byte)x4;
				i2 = i2 + [1];
				text2[i2] = (byte)(x4 >>> 8);
				i2 = i2 + [1];
			}
		}
	}
	private int mul(final int aa, final int ab) {
		int a = aa;
		int b = ab;
		long p = 0L;
		if(a != 0) {
			if(b != 0) {
				p = (long)a * b;
				b = (int)p & 0xFFFF;
				a = (int)p >>> 16;
				return (b - a + (b < a? 1 : 0) & 0xFFFF);
			}
			else {
				return ((1 - a) & 0xFFFF);
			}
		}
		else {
			return ((1 - b) & 0xFFFF);
		}
	}
	private int inv(final int ax) {
		int t0 = 0;
		int t1 = 0;
		int q = 0;
		int y = 0;
		int x = ax;
		if(x <= 1) {
			return (x);
		}
		t1 = 0x10001 / x;
		y = 0x10001 % x;
		if(y == 1) {
			return ((1 - t1) & 0xFFFF);
		}
		t0 = 1;
		do {
			q = x / y;
			x = x % y;
			t0 = t0 + q * t1;
			if(x == 1)
				return (t0);
			q = y / x;
			y = y % x;
			t1 = t1 + q * t0;
		} while(y != 1);
		return ((1 - t1) & 0xFFFF);
	}
}

class Random {
	private long seed;
	private static final long multiplier = 0x5DEECE66DL;
	private static final long addend = 0xBL;
	private static final long mask = (1L << 48) - 1;
	public Random(final long rseed) {
		setSeed(rseed);
	}
	public void setSeed(final long rseed) {
		seed = (rseed ^ multiplier) & mask;
	}
	private int nextbits(final int bits) {
		long oldseed = seed;
		long nextseed = (oldseed * multiplier + addend) & mask;
		seed = nextseed;
		return (int)(nextseed >>> (48 - bits));
	}
	public int nextInt() {
		return nextbits(32);
	}
	public long nextLong() {
		return ((long)(nextbits(32)) << 32) + nextbits(32);
	}
	public boolean nextBoolean() {
		return nextbits(1) != 0;
	}
	public double nextDouble() {
		return (((long)(nextbits(26)) << 27) + nextbits(27)) / (double)(1L << 53);
	}
}

class Timer {
	public static final int max_counters = 64;
	private double[:rank==1] start_time;
	private double[:rank==1] elapsed_time;
	private double[:rank==1] total_time;
	public Timer() {
		final dist(:rank==1) d = [0 : max_counters] -> place.FIRST_PLACE;
		start_time = new double[d](point(:rank==1)p) {
			return 0;
		};
		elapsed_time = new double[d](point(:rank==1)p) {
			return 0;
		};
		total_time = new double[d](point(:rank==1)p) {
			return 0;
		};
	}
	public void start(final int n) {
		start_time[n] = System.currentTimeMillis();
	}
	public void stop(final int n) {
		elapsed_time[n] = System.currentTimeMillis() - start_time[n];
		elapsed_time[n] = elapsed_time[n] / 1000;
		total_time[n] = total_time[n] + elapsed_time[n];
	}
	public double readTimer(final int n) {
		return total_time[n];
	}
	public void resetTimer(final int n) {
		total_time[n] = 0;
		start_time[n] = 0;
		elapsed_time[n] = 0;
	}
	public void resetAllTimers() {
		int i = 0;
		while(i < max_counters) {
			resetTimer(i);
			i++;
		}
	}
}

