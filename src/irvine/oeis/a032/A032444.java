package irvine.oeis.a032;
// Generated by gen_seq4.pl holos [0,-1,0,0,0,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,-3,0,0,0,0,0,0,0,0,0,0,0,1] [1,16,144,96,1200,144,2352,384,1296,1200,5808,288,8112,2352,3600,1536,13872,1296,17328,2400,7056,5808,25392,1152,30000,8112,11664,4704,40368,3600,46128,6144,17424,13872,58800,2592,65712,17328] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A032444 a(1) = 1, a(2) = 16, a(n) = lcm(48, 2n^2) for n&gt;2.
 * @author Georg Fischer
 */
public class A032444 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A032444() {
    super(1, "[0,-1,0,0,0,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,-3,0,0,0,0,0,0,0,0,0,0,0,1]", "[1,16,144,96,1200,144,2352,384,1296,1200,5808,288,8112,2352,3600,1536,13872,1296,17328,2400,7056,5808,25392,1152,30000,8112,11664,4704,40368,3600,46128,6144,17424,13872,58800,2592,65712,17328]", 0);
  }
}
