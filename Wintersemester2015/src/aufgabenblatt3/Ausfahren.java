package aufgabenblatt3;

/**
 * Ausfahren eines Zuges.
 * 
 * @author Wilhelm und Mona
 *
 */
public class Ausfahren implements AufgabeStrategie {

  /**
   * Das Gleis auf dem der Zug ausfahren soll.
   */
  private int gleis;

  /**
   * Der Bahnhof von dem der Zug ausfahren soll.
   */
  private Rangierbahnhof bahnhof;

  /**
   * Konstruktor
   * 
   * @param gleis
   *          Das Gleis auf dem der Zug ausfahren soll.
   * @param bahnhof
   *          Der Bahnhof von dem der Zug ausfahren soll.
   */
  public Ausfahren(int gleis, Rangierbahnhof bahnhof) {
    this.gleis = gleis;
    this.bahnhof = bahnhof;
  }

  /**
   * Lässt einen Zug aus dem Bahnhof ausfahren.
   */
  @Override
  public void aufgabeAusführen() {
    bahnhof.zugAusfahren(gleis);
  }

}
