import Sneakers.Sneaker;
import Whiskey.Whiskey;

import java.util.HashMap;

public final class ServicesManager {

    public static final ServicesManager INSTANCE = new ServicesManager();

    public HashMap<Integer, Sneaker> sneakerInventory;
    public HashMap<Integer, Whiskey> whiskeyInventory;

    public ServicesManager(){
        this.sneakerInventory = new HashMap<>();
        this.whiskeyInventory = new HashMap<>();
    }

    public static ServicesManager getInstance() { return INSTANCE; }





}
