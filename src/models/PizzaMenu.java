package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<PizzaMenuItem> menuItems;
    private LocalDateTime lastUpdate;

    public PizzaMenu(){
        menuItems = new ArrayList<>();
        updateLastUpdateTime();
    }

    public void addItem(PizzaMenuItem toAdd){
        menuItems.add(toAdd);
        updateLastUpdateTime();
    }
    public void removeItem(PizzaMenuItem toRemove){
        menuItems.remove(toRemove);
        updateLastUpdateTime();
    }
    public List<PizzaMenuItem> getMenuItems(){
        return menuItems;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    private void updateLastUpdateTime() {
        lastUpdate = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object obj) {
        PizzaMenu objMenu = (PizzaMenu) obj;
        if(menuItems.size() != objMenu.getMenuItems().size())
            return false;
        for (int i = 0; i < menuItems.size(); i++) {
            if(menuItems.get(i).equals(((PizzaMenu) obj).getMenuItems().get(i))){

            }
        }
        return menuItems.size() == objMenu.getMenuItems().size();
    }
}
