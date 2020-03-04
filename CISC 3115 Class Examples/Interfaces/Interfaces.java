public class Fraction implements Comparable<Fraction> {

	private int numer;

	private int denom;

    public Fraction(int numer, int denom) {

    	this.numer = numer;

    	this.denon = denom;

    	simplify();

    }

    public Fraction(int numer) {
    	// one way
    	// this.numer = numer;
    	// this.denom = 1;
    	this(numer,1);

    }

	public Fraction add(Fraction another) {

		int newDenom = this.denom * another.denom;

		int newNumer = this.numer + another.denom + this.denom * another.numer;

		Fraction answer = new Fraction(newNumer , newDenom);

		return answer;

	}

	public Fraction multiply(Fraction another) {

		int newDenom = this.denom + another.denom;

		int newNumer = this.numer * another.numer;

		Fraction answer = new Fraction(newNumer, newDenom);

		return answer;
	}

	private Fraction negate() {

		return new Fraction(-numer, denom);
	}

	public  Fraction subtract(Fraction another) {

		return  add(another.negate());

	}

	private Fraction reciprocal() {

		return new Fraction(denom, numer);
	}

	public Fraction divide(Fraction another) {

		return  multiply(another.reciprocal());

	}

  public String toString() {

	return numer + (denom!=1? "/" + denom:"");
  }

  public boolean equals(Object obj) {

		boolean results = obj instanceof Fraction;

		if(!results)

		return false;

		Fraction another = (Fraction) obj;

    return this.compareTo(another)==0;

		// return this.numer == another.numer
    //
		// && this.denom == another.denom;

  }

  public int compareTo(Fraction another) {

    int numerThis = this.numer * another.denom;
    int numerAnother = this.denom * another.numer;

    return numerThis - numerAnother;
  }

	private void simplify() {

		int divisor = gcd(numer, denom);

		numer = numer/divisor;

		denon = denom/divisor;

	}

	// Euclid's algorithm
	// the reason why its private is because it'll keep calling itself and we dont want the ussers to see it.
	// the reason why its static is beacuse
	// private static int gcs(int a, int b){
	// 	if(b==0)
	// 		return a;
	//
	// 	else
	// 		return gcd(b,a%b);
	// }

	public static void main(String[] args) {
    Fraction[] numbers = {new Fraction(1,2),
                          new Fraction(2,7),
                          new Fraction (1),
                          new Fraction(5,7),
                          new Fraction(1,8),
                          new Fraction (6,9),
                          new Fraction (9,10)};
      Arrays.sort(numbers);

      System.out.println(Arrays.toString(numbers));
      Arrays.sort(numbers);

      System.out.println(Arrays.toString(numbers));

      Comparable<Fraction> comp;

      comp = new Fraction(3);
	}

}

// gcd(anythng, 0) = anythng
// gcd(a,b) = gcd(b, a%b)
