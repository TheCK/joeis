package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;
import irvine.util.Point;

/**
 * A056631 Series expansion for 2nd area weighted moment for square lattice.
 * @author Sean A. Irvine
 */
public class A056631 extends A002931 {

  {
    super.next();
  }

  @Override
  protected Z postFilter() {
    Z total = Z.ZERO;
    for (final Polygon polygon : mPolygons) {
      // Area
      int area = 0;
      Point pt0 = null;
      for (final Point pt1 : polygon) {
        if (pt0 != null) {
          area += pt0.left() * pt1.right() - pt1.left() * pt0.right();
        }
        pt0 = pt1;
      }
      // Wrap around to get the last point closing the polygon
      for (final Point pt1 : polygon) {
        area += pt0.left() * pt1.right() - pt1.left() * pt0.right();
        break;
      }
      area /= 2;
      // Second moment
      total = total.add((long) area * area);
    }
    return total;
  }
}
