package Restaurant;

import java.awt.*;
import java.util.List;

public class Menu {
        private List<MenuItem> menuItems;

        public Menu(List<MenuItem> menuItems) {
            this.menuItems = menuItems;
        }

        public List<MenuItem> getMenuItems() {
            return menuItems;
        }

        public void setMenuItems(List<MenuItem> menuItems) {
            this.menuItems = menuItems;
        }
    }
