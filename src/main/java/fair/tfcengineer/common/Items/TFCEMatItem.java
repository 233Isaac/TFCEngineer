package fair.tfcengineer.common.Items;

import com.bioxx.tfc.Items.ItemTerra;
import net.minecraft.client.renderer.texture.IIconRegister;

public class TFCEMatItem extends ItemTerra {

    public TFCEMatItem() {
    }

    @Override
    public void registerIcons(IIconRegister reg) {
        // Taken from default item class
        this.itemIcon = reg.registerIcon(getIconString());
    }


}
