package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2021-10-05 14:59

import irvine.oeis.HolonomicRecurrence;
/**
 * A126378 Number of base 24 n-digit numbers with adjacent digits differing by one or less.
 * x^24-24*x^23+253*x^22-1518*x^21+5544*x^20-11704*x^19+8911*x^18+20178*x^17-60078*x^16+41344*x^15+60078*x^14-117572*x^13+18564*x^12+102816*x^11-66198*x^10-38148*x^9+44847*x^8+3816*x^7-13776*x^6+1008*x^5+1974*x^4-216*x^3-108*x^2+8*x+1
 * @author Georg Fischer
 */
public class A126378 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126378() {
    super(0, "[[0],[1],[8],[-108],[-216],[1974],[1008],[-13776],[3816],[44847],[-38148],[-66198],[102816],[18564],[-117572],[60078],[41344],[-60078],[20178],[8911],[-11704],[5544],[-1518],[253],[-24],[1]]", "[1, 24, 70, 206, 608, 1798, 5324, 15780, 46806, 138918, 412508, 1225432, 3641690, 10825628, 32190154, 95741294, 284820048, 847475910, 2522096172, 7507000776, 22347852666, 66537181776, 198128815230, 590039959434, 1757365514652]", 0);
  }
}
