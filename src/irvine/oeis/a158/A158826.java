package irvine.oeis.a158;
// Generated by gen_seq4.pl holos at 2021-06-07 19:33
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A158826 Third iteration of x*C(x) where C(x) is the Catalan function (A000108).
 * radtorec(1/2-1/2*(-1+2*(-1+2*(1-4*x)^(1/2))^(1/2))^(1/2))
 * @author Georg Fischer
 */
public class A158826 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A158826() {
    super(1, "[[0],[-2650502400, 2769875200,-1156890624, 241401856,-25165824, 1048576],[2465784384,-3136157328, 1605753728,-413457152, 53499904,-2781184],[-741457248, 1114935224,-672689112, 203453168,-30824064, 1869824],[87400512,-160615920, 116999896,-42231064, 7546544,-533264],[-3351456, 8647416,-8356740, 3824880,-833484, 69384],[0,-81432, 169650,-118755, 33930,-3393]]", "1, 3, 12, 54, 260, 1310, 6824, 36478, 199094, 1105478, 6227712", 0);
  }
}
