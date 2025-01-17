package irvine.oeis.a051;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051585 Number of integer-sided triangles of area 6n.
 * @author Sean A. Irvine
 */
public class A051585 implements Sequence {

  // After Charles R Greathouse IV

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long z = LongUtils.sqrt(LongUtils.sqrt(192 * mN * mN) - 1) + 1; z <= LongUtils.sqrt(9 * (64 * mN * mN + 5) / 20); ++z) {
      for (long y = z / 2 + 1; y <= z; ++y) {
        final long t = y * y * z * z - 144 * mN * mN;
        if (t >= 0) {
          final long s = LongUtils.sqrt(t);
          if (s * s == t) {
            final long u = y * y + z * z - 2 * s;
            if (u >= 0) {
              final long v = LongUtils.sqrt(u);
              if (v <= y && v * v == u) {
                ++cnt;
              }
            }
            if (t != 0) {
              final long w = y * y + z * z + 2 * s;
              if (w >= 0) {
                final long x = LongUtils.sqrt(w);
                if (x <= y && x * x == w) {
                  ++cnt;
                }
              }
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

/*
a(n)=sum(z=sqrtint(sqrtint(192*n^2)-1)+1, sqrtint(9*(64*n^2+5)\20),
 sum(y=z\2+1, z,
  my(
  t=(y*z)^2-(12*n)^2, x);
   if(issquare(t, &t), (issquare(y^2+z^2-2*t, &x) && x<=y) + (t && issquare(y^2+z^2+2*t, &x) && x<=y), 0)
  )
)
 */
