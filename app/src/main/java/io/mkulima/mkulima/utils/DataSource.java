package io.mkulima.mkulima.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.mkulima.mkulima.models.Content;
import io.mkulima.mkulima.models.Item;

/**
 * Created by walter on 8/31/18.
 */

public class DataSource {
    public static List<Item> getData(){
        List<Item> items=new ArrayList<>();
        //Content for item One
        String[] itemOneContent ={"Expenditures from nursery to harvesting include; Equipment’s, labor, Chemicals, Transport, purchasing seedlings/seeds.","These prices vary depending on geographical location and need. But in Kenya to grow onions in 1 acre one requires roughly 80, 000-125, 000"};
        ArrayList<Content> array1 = converter(itemOneContent);
        Item item1=new Item("Cost Analysis",array1);
        items.add(item1);

        String[] itemTwoContent ={"This depends on seed variety, and crop management.","But an onion farmer can get roughly 10T-15T per acre for local breeds and 20-30T for hybrid varieties.","Disclaimer: This is only true if crop management is done effectively."};
        ArrayList<Content> array2 = converter(itemTwoContent);
        Item item2=new Item("Expected Yield",array2);
        items.add(item2);

        String[] itemThreeContent ={"Choose a place where no onion family crop has been cultivated for at least 2 years.","Construct raised beds, 1 meter wide.","Prepare the soil so that there are no lumps. Raised beds will stop seeds being washed away by rain. Dig deep into the bed so the onions can grow good roots. ","1 week before planting, mix well-rotted manure into the soil.","Drench soil with a mixture of a growth stimulator, pesticides, and fertilizer (DAP/TSP and NPK) in water. This will help to eradicate soil pests and diseases, break seed dormancy and promote uniform germination.","Form shallow furrows.","Plant seeds 8 cm apart in rows 15 cm apart. Cover the seeds lightly with soil.","Mulch and water the bed.","Seeds germinate within 10-20 days after sowing.","After germination, mulch is removed.","CAN fertilizer should be applied between week 3 to 4"};
        ArrayList<Content> array3 = converter(itemThreeContent);
        Item item3=new Item("Procedure",array3);
        items.add(item3);

        String[] itemFourContent ={"Seeds are ready for transplanting 6-8 weeks after sowing. Seedling necks are pencil-size and the plant is about 16-30 cm tall and have 4 to 5 leaves.","Transplanting should be done early in the morning from 6-10am or late evening 4-6pm.","Prior to transplanting, the nursery bed should be watered to saturation in order to avoid damaging the seedlings","To overcome transplanting shock, seedlings should be sprayed with growth hormones","Seedlings are pulled from the wet nursery bed and transplanted in the main field soonest possible at a spacing of 8*15cm."};
        ArrayList<Content> array4 = converter(itemFourContent);
        Item item4=new Item("Transplanting",array4);
        items.add(item4);

        return  items;
    }

    private static ArrayList<Content> converter(String[] data){
        ArrayList<Content> contents=new ArrayList<>();
        for (String s:data) {
           contents.add(new Content(s));
        }
        return  contents;
    }

}
