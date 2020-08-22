package irvine.oeis.a072;
// Generated by gen_seq4.pl holos [[0],[-63700992000,256927334400,-426885120000,378519552000,-192688128000,54956851200,-7004160000,-294912000,184320000,-14745600],[101548892160,-328631473152,389453749248,-191169058048,16585617408,16319648256,-3948100608,-247848192,83177472,5395456],[-79638769920,168256488224,-65406742400,-56583671736,31888677688,3734104904,-1857616568,-368726736,-23254176,-489280],[32009162880,23833316464,-101959040512,12735690548,25889246928,6677373896,767310992,45557028,1365408,16368],[91411200000,-129168000000,-136825063200,-44629652488,-7344117490,-700857580,-40573852,-1408176,-26994,-220],[131681894400,74504779776,18304522560,2566858896,226815345,13119381,497530,11946,165,1]] [1,2,6,24,120,720] 0 at 2020-03-14 22:45
// Recurrence: (n+9)^2*(n+16)^2*(n+21)^2*(n+24)^2*(n+25)*a[n+0]=2*(110*n^9+13497*n^8+704088*n^7+20286926*n^6+350428790*n^5+3672058745*n^4+22314826244*n^3+68412531600*n^2+64584000000*n-45705600000)*a[n-1]-4*(n-1)^2*(4092*n^7+349536*n^6+12084237*n^5+215646686*n^4+2088552609*n^3+10433770264*n^2+21962910556*n+8002290720)*a[n-2]+8*(n-2)^2*(n-1)^2*(61160*n^5+3273732*n^4+64938154*n^3+580006399*n^2+2208119423*n+2488711560)*a[n-3]-256*(n-3)^2*(n-2)^2*(n-1)^2*(21076*n^3+577824*n^2+4743323*n+11018760)*a[n-4]+7372800*(n-4)^2*(n-3)^2*(n-2)^2*(n-1)^2*(2*n+15)*a[n-5]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A072167 T_10(n) in the notation of Bergeron et al., u_10(n) in the notation of Gessel: Related to Young tableaux of bounded height.
 * @author Georg Fischer
 */
public class A072167 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A072167() {
    super(1, "[[0],[-63700992000,256927334400,-426885120000,378519552000,-192688128000,54956851200,-7004160000,-294912000,184320000,-14745600],[101548892160,-328631473152,389453749248,-191169058048,16585617408,16319648256,-3948100608,-247848192,83177472,5395456],[-79638769920,168256488224,-65406742400,-56583671736,31888677688,3734104904,-1857616568,-368726736,-23254176,-489280],[32009162880,23833316464,-101959040512,12735690548,25889246928,6677373896,767310992,45557028,1365408,16368],[91411200000,-129168000000,-136825063200,-44629652488,-7344117490,-700857580,-40573852,-1408176,-26994,-220],[131681894400,74504779776,18304522560,2566858896,226815345,13119381,497530,11946,165,1]]", "[1,2,6,24,120,720]", 0);
  }
}
