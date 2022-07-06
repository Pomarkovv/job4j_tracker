package ru.job4j.tracker;

import java.util.List;

public class AllItemsAction implements UserAction {

    private final Output out;

    public AllItemsAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ===");
        List<Item> items = tracker.findAll();
        if (items.size() > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("We don't have items...");
        }
        return true;
    }
}
