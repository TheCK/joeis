package irvine.oeis.a346;
// Generated by gen_seq4.pl holos at 2021-08-16 19:34

import irvine.oeis.HolonomicRecurrence;
/**
 * A346458 Numbers with hexadecimal representation A, AB, ABC, ..., ABCDEFA, ABCDEFAB, ...
 * radtorec(x*(15*x^5+14*x^4+13*x^3+12*x^2+11*x+10)/(16*x^7-x^6-16*x+1))
 * @author Georg Fischer
 */
public class A346458 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A346458() {
    super(1, "[[0],[-2640, 240],[-1851, 209],[-1330, 194],[-869, 179],[-468, 164],[-127, 149],[2650,-250],[1851,-209],[1330,-194],[869,-179],[468,-164],[127,-149],[-10, 10]]", "[10, 171, 2748, 43981, 703710, 11259375, 180150010, 2882400171, 46118402748, 737894443981, 11806311103710, 188900977659375, 3022415642550010, 48358650280800171]", 0);
  }
}
