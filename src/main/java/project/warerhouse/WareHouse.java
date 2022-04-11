package project.warerhouse;

import java.io.IOException;
import java.util.Map;

public class WareHouse {

    private Map<Integer, VesselBox> stock;

    public void addBox(VesselBox box) throws IOException {
        stock.put(stock.size(), box);
        Stocktaking.registerBox(box);
    }

    VesselBox getBox() {
        return stock.get(stock.size() - 1);
    }

    void removeBox() throws IOException {
        Stocktaking.disposeBox(stock.get(stock.size() -1));
        stock.remove(stock.size() - 1);

    }
}

