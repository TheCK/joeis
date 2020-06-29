package irvine.oeis.a032;

/**
 * A032897 Numbers n such that base 9 representation <code>Sum{d(i)*9^i: i=0,1,...,m</code> has <code>d(0)&gt;=d(1)&lt;=d(2)&gt;=..</code>.
 * @author Sean A. Irvine
 */
public class A032897 extends A032890 {

  @Override
  protected int base() {
    return 9;
  }
}
