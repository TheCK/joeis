package irvine.oeis.a120;
// Generated by gen_seq4.pl A120134/parm4 at 2022-03-24 23:21

/**
 * A120155 a(1)=10; a(n)=floor((31+sum(a(1) to a(n-1)))/3).
 * @author Georg Fischer
 */
public class A120155 extends A120134 {

  /** Construct the sequence. */
  public A120155() {
    super(10, 31, 3);
  }
}
