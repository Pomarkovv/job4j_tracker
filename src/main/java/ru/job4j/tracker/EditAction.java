package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        System.out.print("Enter name: ");
        String name = input.askStr("Enter id: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Changed successfully");
        } else {
            System.out.println("Change error");
        }
        return true;
    }
}
