package irvine.oeis.a032;

/**
 * A032942 Numbers n such that base 7 representation <code>Sum{d(i)*7^i: i=0,1,...,m}</code> has <code>d(i)=0</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032942 extends A032937 {

  @Override
  protected int base() {
    return 7;
  }
}
