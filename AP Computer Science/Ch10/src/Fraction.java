/**
 * Represents a fraction with an int numerator and int denominator
 * and provides methods for adding and multiplying fractions.
 *
 * Author: Alex
 */

public class Fraction
{

  // ******************  Instance variables  ******************

  private int num;
  private int denom;

  // *********************  Constructors  *********************

  public Fraction()       // no-args constructor
  {
    this(0,1);
  }

  public Fraction(int n)
  {
    this(n, 1);
  }

  public Fraction(int n, int d)
  {
    if (d != 0)
    {
      num = n;
      denom = d;
      reduce();
    }
    else
    {
      throw new IllegalArgumentException(
           "Fraction construction error: denominator is 0");
    }
  }

  public Fraction(Fraction other)  // copy constructor
  {
    this.num = other.num;
    this.denom = other.denom;
  }

  // ********************  Public methods  ********************

  // Returns the sum of this fraction and other
  public Fraction add(Fraction other)
  {
    int newNum = num * other.denom + denom * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  // Returns the sum of this fraction and m
  public Fraction add(int m)
  {
    return new Fraction(num + m * denom, denom);
  }

  public Fraction subtract(Fraction other)
  {
    return add(other.multiply(-1));
  }

  public Fraction subtract(int m)
  {
    return subtract(new Fraction(m));
  }

  // Returns the product of this fraction and other
  public Fraction multiply(Fraction other)
  {
    int newNum = num * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  // Returns the product of this fraction and m
  public Fraction multiply(int m)
  {
    return new Fraction(num * m, denom);
  }

  public Fraction divide(Fraction other)
  {
    return multiply(new Fraction(other.denom, other.num));
  }

  public Fraction divide(int m)
  {
    return multiply(new Fraction(1, m));
  }

  // Returns the value of this fraction as a double
  public double getValue()
  {
    return (double)num / (double)denom;
  }
  
  // Returns a string representation of this fraction
  public String toString()
  {
    return num + "/" + denom;
  }

  // *******************  Private methods  ********************

  // Reduces this fraction by the gcf and makes denom > 0
  private void reduce()
  {
    if (num == 0)
    {
      denom = 1;
      return;
    }

    if (denom < 0)
    {
      num = -num;
      denom = -denom;
    }

    int q = gcf(Math.abs(num), denom);
    num /= q;
    denom /= q;    
  }

  // Returns the greatest common factor of two positive integers
  private int gcf(int n, int d)
  {
    if (n <= 0 || d <= 0)
    {
      throw new IllegalArgumentException(
                  "gcf precondition failed: " + n + ", " + d);
    }

    while (d != 0)
    {
      int temp = d;
      d = n % d;
      n = temp;
    }
    return n;
  }
}
