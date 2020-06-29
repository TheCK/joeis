package irvine.oeis.a032;

/**
 * A032951 Numbers n such that base 16 representation <code>Sum{d(i)*16^i: i=0,1,...,m}</code> has <code>d(i)=0</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032951 extends A032937 {

  @Override
  protected int base() {
    return 16;
  }
}
