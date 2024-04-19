package pages.staffPages.manager;

import services.ManageMenuService;

import pages.iPage;
import pages.pageViewer;
import utilities.Session;

public class ManagerEditMenuItemsPage implements iPage {
        /**
     * The current active session 
     */
    private Session session;
    public ManagerEditMenuItemsPage(Session s){
        this.session = s;
    }
    /**
     * Method to view manager menu editing mode options
     */
    public void viewOptions(){
        System.out.println("== Manager Edit Menu Items Page ==");
        System.out.println("[1] View Menu Items");
        System.out.println("[2] Add Menu Item");
        System.out.println("[3] Remove Menu Items");
        System.out.println("[4] Edit Menu Items");
        System.out.println("[B] Return to Manager Access Page");
    }
    /**
     * Method to handle user input 
     * @param choice branches the pages
     */
    public void handleInput(String choice){
        switch (choice) {
             case "1":
                 ManageMenuService.displayAllMenuItems(this.session);
                 pageViewer.changePage("current");
                 break;
            case "2":
                ManageMenuService.addMenuItem(this.session);
                pageViewer.changePage("current");
                break;
            case "3":
                ManageMenuService.removeMenuItem(this.session);
                pageViewer.changePage("current");
                break;
            case "4":
                ManageMenuService.editMenuItem(this.session);
                pageViewer.changePage("current");
                break;
            case "b":
            case "B":
                pageViewer.changePage("back");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}

