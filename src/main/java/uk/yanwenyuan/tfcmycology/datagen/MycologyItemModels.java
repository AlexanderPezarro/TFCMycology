package uk.yanwenyuan.tfcmycology.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static uk.yanwenyuan.tfcmycology.Mycology.MOD_ID;

public class MycologyItemModels extends ItemModelProvider {
    public MycologyItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> itemObject) {
        return withExistingParent(
                itemObject.getId().getPath(), new ResourceLocation("item/generated")
        ).texture(
                "layer0", new ResourceLocation(MOD_ID, "item/%s".formatted(itemObject.getId().getPath()))
        );
    }

}
