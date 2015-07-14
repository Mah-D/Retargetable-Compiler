#!/usr/bin/perl
use File::Find;
use diagnostics;

$ARGV[0] || die "Must supply directory to search for psdata files as arg 1\n";
$NUM_COLS = 7;
$basedir = $ARGV[0];
chomp($basedir);
if (!($basedir =~ m/^\//))
{
  $pwd = `pwd`;
  chomp($pwd);
  $basedir = "$pwd/$basedir";
}

find({follow => 1, wanted => \&handle_files}, $basedir);

sub handle_files
{
  $filename = $_;
  
  if ($filename =~m/.*\.psdata/)
  {
    open (INFILE, "<$filename") || die "Open file failed!\n";
    
    my $linecount = 0;
    my $processcount = 0;

    @filearr = ();
    while ($templine = <INFILE>)
    {
      push @filearr, $templine;
    }
    close(INFILE);
    if (@filearr < 3)
    {
      print "File $filename didn't have enough lines!\n";
      return;
    }

    
    $pidline = $filearr[0];
    chomp($pidline);
    @pidarr = split(/,/, $pidline);

    $processline = $filearr[1];

    chomp($processline);
    @processarr = split(/,/, $processline);
    %pidnamehash = ();
    $headerline = $filearr[2];
    
    chomp($headerline);
    %pidfilehash = ();

    if (@processarr != @pidarr)
    {
      print "Count of pids not equal to count of processes\n";
      close(INFILE);
      return -1;
    }

    for (my $i = 0; $i < @processarr; $i++)
    {
      #print "$processarr[$i], $pidarr[$i]\n";
      $pidnamehash{$pidarr[$i]} = $processarr[$i];
      
      if ($_ =~m/hosts_replaced/)
      {
        $tempfilename = "$File::Find::dir/$pidnamehash{$pidarr[$i]}_hosts_replaced.newpsdata";
      }
      else
      {
        $tempfilename = "$File::Find::dir/$pidnamehash{$pidarr[$i]}.newpsdata";
      }

      open($pidfilehash{$pidarr[$i]}, ">$tempfilename") || die "Failed to open output file!\n";
      my $tempfilehandle = $pidfilehash{$pidarr[$i]};
      print $tempfilehandle "$headerline\n";
    }

    for ($i = 3; $i < @filearr; $i = $i + 1)
    {
      $line = $filearr[$i];
      chomp($line);
      @linearr = split(/ /, $line);
      
      my $innercount = 0;
      my $templine = "";
      for (my $j = 10; $j < @linearr; $j++)
      {
        $templine = $templine . " $linearr[$j]";
        #print "$templine\n";
        if ((($templine =~m/defunct/) && ($innercount == $NUM_COLS + 1)) || ((!($templine =~m/defunct/)) && ($innercount == $NUM_COLS)))
        {
          #print "Would write:\n$templine\nto$File::Find::dir/$pidnamehash{$linearr[$j]}\n";
	  
          my $tempfilehandle = $pidfilehash{$linearr[$j]};
          print $tempfilehandle ("$linearr[0] $linearr[1] $templine\n");
          $templine = "";
          $innercount = 0;
        }
        else
        {
          $innercount++;
        }
      }
    }
    close(INFILE);
  }
  
}

