package irvine.oeis.a328;
// Generated by gen_seq4.pl holos [[0],[277305600,-1871446720,4952997920,-6843162560,5404590880,-2501472480,664681680,-93169440,5307120],[436140672,-2899031264,7676558288,-10716246064,8656934536,-4159444056,1166573232,-175661136,10940832],[139145952,-899402656,2369497136,-3330741172,2752485572,-1378844184,411322320,-67146408,4613112],[-36673032,254671020,-717208984,1090041746,-981858084,538899894,-176960376,31978800,-2449440],[-12324048,86477832,-253464484,407039414,-393710399,235935678,-85857516,17395560,-1505385],[-132528,1156140,-4214695,8341631,-9818710,7061280,-3040065,718389,-71442],[0,0,0,-60401,192965,-240402,146394,-43659,5103]] [1,0,26,264,5646,101520,2103740,43632960] 0 at 2020-03-14 22:45
// Recurrence: (n-1)*n^3*(5103*n^4-38556*n^3+107838*n^2-132564*n+60401)*a[n+0]=(n-1)^2*(71442*n^6-575505*n^5+1817613*n^4-2850549*n^3+2299999*n^2-891084*n+132528)*a[n-1]+(1505385*n^8-17395560*n^7+85857516*n^6-235935678*n^5+393710399*n^4-407039414*n^3+253464484*n^2-86477832*n+12324048)*a[n-2]+2*(n-2)*(1224720*n^7-13539960*n^6+61400268*n^5-146649411*n^4+197630220*n^3-149760433*n^2+59083626*n-9168258)*a[n-3]-4*(n-3)*(n-2)*(1153278*n^6-11020212*n^5+40809852*n^4-74540514*n^3+70559711*n^2-32643654*n+5797748)*a[n-4]-8*(n-4)*(n-3)*(n-2)*(1367604*n^5-9649206*n^4+23421096*n^3-25438791*n^2+12638258*n-2271566)*a[n-5]-1040*(n-5)*(n-4)*(n-3)*(n-2)*(5103*n^4-18144*n^3+22788*n^2-12144*n+2222)*a[n-6]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A328874 Constant term in the expansion of (-1 + (1 + x + 1/x) * (1 + y + 1/y) * (1 + z + 1/z))^n.
 * @author Georg Fischer
 */
public class A328874 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A328874() {
    super(0, "[[0],[277305600,-1871446720,4952997920,-6843162560,5404590880,-2501472480,664681680,-93169440,5307120],[436140672,-2899031264,7676558288,-10716246064,8656934536,-4159444056,1166573232,-175661136,10940832],[139145952,-899402656,2369497136,-3330741172,2752485572,-1378844184,411322320,-67146408,4613112],[-36673032,254671020,-717208984,1090041746,-981858084,538899894,-176960376,31978800,-2449440],[-12324048,86477832,-253464484,407039414,-393710399,235935678,-85857516,17395560,-1505385],[-132528,1156140,-4214695,8341631,-9818710,7061280,-3040065,718389,-71442],[0,0,0,-60401,192965,-240402,146394,-43659,5103]]", "[1,0,26,264,5646,101520,2103740,43632960]", 0);
  }
}
