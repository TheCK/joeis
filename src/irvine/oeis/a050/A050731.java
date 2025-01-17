package irvine.oeis.a050;

/**
 * A050731 Decimal expansion of 11^n contains no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050731 extends A050724 {

  @Override
  protected long multiplier() {
    return 11;
  }
}

