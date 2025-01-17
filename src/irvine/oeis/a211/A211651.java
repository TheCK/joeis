package irvine.oeis.a211;
// Generated by gen_seq4.pl A211422/parmof3 at 2022-02-02 22:53

/**
 * A211651 Number of ordered triples (w,x,y) with all terms in {1,...,n} and w^3&gt;=x^3+y^3.
 * @author Georg Fischer
 */
public class A211651 extends A211422 {

  /** Construct the sequence. */
  public A211651() {
    super(0, n -> new Long[] {1L, n}, (n, w, x, y) -> w * w * w >= x * x * x + y * y * y);
  }
}
