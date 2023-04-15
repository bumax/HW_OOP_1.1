package exercises;

/**
 * Туалетная бумага
 */
public class ToiletPaper extends Hygiene{
    public ToiletPaper(String name, Double price, Integer quantity, Integer quantityPerPackage, Integer layersNum) {
        super(name, price, quantity, quantityPerPackage);
        this.layersNum = layersNum;
    }

    public Integer getLayersNum() {
        return layersNum;
    }

    public void setLayersNum(Integer layersNum) {
        this.layersNum = layersNum;
    }

    /**
     * Количество слоёв
     */
    private Integer layersNum;

    @Override
    public String toString() {
        return "ToiletPaper - " +
                super.toString().replace("}", ", Количество слоёв = " + layersNum + "шт.}");
    }
}
