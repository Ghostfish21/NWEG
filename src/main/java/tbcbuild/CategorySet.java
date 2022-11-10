package tbcbuild;

import tbcbuild.cardType.Category;
import tbcbuild.category.*;

import java.util.HashMap;

public class CategorySet {
    public static final HashMap<String, Class<? extends Category>> categorySet = new HashMap<>();
    public static final HashMap<Class<? extends Category>, String> indices = new HashMap<>();
    public static final HashMap<Class<? extends Category>, Category> instance = new HashMap<>();

    public CategorySet() {
        Category.register(Cate_SpiritualCaToken.class, new Cate_SpiritualCaToken() {});
        Category.register(Cate_CoolantExportable.class, (Cate_CoolantExportable) () -> null);
        Category.register(Cate_CoolantImportable.class, (Cate_CoolantImportable) () -> null);
        Category.register(Cate_Breakable.class, (Cate_Breakable) () -> null);
        Category.register(Cate_Chargable.class, new Cate_Chargable() {
            public Cate_Chargable instance;
            @Override
            public String amountOfPowerRequiredToRun() {
                if (instance != null) return instance.amountOfPowerRequiredToRun();
                return null;
            }
            @Override
            public <T extends Category> void setInstance(T instance) {
                this.instance = (Cate_Chargable) instance;
            }
        });
        Category.register(Cate_WireLessCharger.class, new Cate_WireLessCharger() {
            public Cate_WireLessCharger instance;
            @Override
            public String totalPower() {
                if (instance != null) return instance.totalPower();
                return null;
            }
            @Override
            public <T extends Category> void setInstance(T instance) {
                this.instance = (Cate_WireLessCharger) instance;
            }
        });
    }

    public static <T extends Category> String loreOf(Class<T> clazz, T instance) {
        Category category = CategorySet.instance.get(clazz);
        category.setInstance(instance);
        return CategorySet.instance.get(clazz).exportLore();
    }

    public static String categoryIndex(Class<? extends Category> category) {
        return indices.getOrDefault(category, "未知");
    }
}
