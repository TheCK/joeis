package irvine.oeis.a032;

/**
 * A032941 Numbers n such that base 6 representation Sum{d(i)*6^i: i=0,1,...,m} has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032941 extends A032937 {

  @Override
  protected int base() {
    return 6;
  }
}
