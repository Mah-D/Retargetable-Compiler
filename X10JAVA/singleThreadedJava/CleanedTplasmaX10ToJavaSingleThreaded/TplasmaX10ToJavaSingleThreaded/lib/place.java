package lib;



	public class place {
		public static final int MAX_PLACES = 3;
		public int ID = 0;
		public int id = 0;
		public static place FIRST_PLACE = new place(0);
		public static place LAST_PLACE = new place(3);
		public place(int ID){
			this.ID = ID;
			this.id = ID;
		}
		public static place places(Object c){
			
			return null;
		}
		
		public place next(){
			if(this.id < 3 ){
			return new place(this.id++);
			}else{
				return new place(3);
			}
		}
		public place prev(){
			if(this.id > 0 ){
			return new place(this.id--);
			}else{
				return new place(0);
			}
		}
		
		
	}


