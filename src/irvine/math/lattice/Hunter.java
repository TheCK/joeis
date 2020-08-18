package irvine.math.lattice;

import java.util.HashSet;

/**
 * Count the number of animals on a specified lattice.
 * @author Sean A. Irvine
 */
public class Hunter {

  protected final Lattice mLattice;
  protected long mCount = 0;
  protected Keeper mKeeper = animal -> increment(1);
  private final Canonicalizer mCanon;
  private final boolean mForbidden;

  /**
   * Construct a hunter on the specified lattice.
   * @param lattice underlying lattice
   * @param canon canonicalizer
   * @param forbidden should forbidden points implementation be used (normally set this to true)
   */
  public Hunter(final Lattice lattice, final Canonicalizer canon, final boolean forbidden) {
    mLattice = lattice;
    mCanon = canon;
    mForbidden = forbidden;
  }

  /**
   * Construct a hunter on the specified lattice.
   * @param lattice underlying lattice
   */
  public Hunter(final Lattice lattice) {
    this(lattice, animal -> animal, false);
  }

  /**
   * Set the function called for each walk.
   * @param keeper the keeper
   */
  public void setKeeper(final Keeper keeper) {
    mKeeper = keeper;
  }

  /**
   * Increment the count.
   * @param count count
   */
  public void increment(final long count) {
    mCount += count;
  }

  private void search(final Animal animal, final int remainingSteps) {
    if (remainingSteps == 0) {
      mKeeper.process(animal);
    } else {
      final HashSet<Animal> h = new HashSet<>();
      final HashSet<Long> hc = new HashSet<>();
      for (final long p : animal.points()) {
        for (int k = 0; k < mLattice.neighbourCount(p); ++k) {
          final long q = mLattice.neighbour(p, k);
          if (!animal.contains(q) && !animal.mForbidden.contains(q) && hc.add(q)) {
            final Animal a = new Animal(animal, q);

            if (mForbidden) {
              // Set forbidden points (these points should never be considered
              // in future expansion of this animal
              a.mForbidden.addAll(hc);
              a.mForbidden.remove(q); // not strictly necessary
            }

            final Animal c = mCanon.canon(a);
            if (h.add(c)) {
              search(c, remainingSteps - 1);
            }
          }
        }
      }
    }
  }

  /**
   * Return the number of animals of specified size.
   * @param steps length of walk
   * @return number of walks
   */
  public long count(final int steps, final Animal animal) {
    if (steps <= animal.size()) {
      return 1;
    }
    mCount = 0;
    search(animal, steps - animal.size());
    return mCount;
  }

  /**
   * Return the number of animals of specified size.
   * @param steps length of walk
   * @return number of walks
   */
  public long count(final int steps) {
    if (steps <= 1) {
      return 1;
    }
    final Animal animal = new Animal(mLattice.origin());
    return count(steps, animal);
  }

  /**
   * Noddy for testing.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final Lattice l = new SquareLattice();
    //final Lattice l = new FccLattice();
    final Canonicalizer canonicalizer = Canons.createTranslator(l);
    final Hunter h = new Hunter(l, canonicalizer, true) {
      {
        setKeeper(new Keeper() {
          final HashSet<Animal> mUnique = new HashSet<>();

          @Override
          public void process(final Animal animal) {
            if (mUnique.add(canonicalizer.canon(animal))) {
              // todo note this will not parallelize as is because uniqueness only up to thread!

//              final StringBuilder sb = new StringBuilder();
//              for (final long p : canonicalizer.canon(animal)) {
//                sb.append(l.toString(p));
//              }
//              System.out.println(sb);
              increment(1);
            }
          }
        });
      }
    };
    for (int k = 0; k < 12; ++k) {
      System.out.println(k + " " + h.count(k));
    }
  }
}
