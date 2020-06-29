package irvine.oeis.a032;

/**
 * A032961 Numbers n such that base 11 representation <code>Sum{d(i)*11^i: i=0,1,...,m}</code> has even <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032961 extends A032953 {

  @Override
  protected int base() {
    return 11;
  }
}
