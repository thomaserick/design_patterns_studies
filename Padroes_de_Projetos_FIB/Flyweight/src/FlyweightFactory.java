import java.util.ArrayList;

public class FlyweightFactory {
	protected ArrayList<ArquivosFlyweight> flyweights;
 
    public FlyweightFactory() {
        flyweights = new ArrayList<ArquivosFlyweight>();
        flyweights.add(new ArquivoConcrete("2017", "pdf"));
        flyweights.add(new ArquivoConcrete("2018", "pdf"));
        flyweights.add(new ArquivoConcrete("2019", "pdf"));
        flyweights.add(new ArquivoConcrete("Fiscal", "xlsx"));
    }
 
    public ArquivosFlyweight getFlyweight(Files file) {
        switch (file) {
        case PDF_2017:
            return flyweights.get(0);
        case PDF_2018:
            return flyweights.get(1);
        case PDF_2019:
            return flyweights.get(2);
        default:
            return flyweights.get(3);
        }
    }
}
