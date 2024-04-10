package constants;

/**
 * Enum representing file paths for various data files.
 */
public enum FilePaths {
    /**
     * Path to the branch list CSV file.
     */
    branchListPath("utilities/data/branch_list.csv"),

    /**
     * Path to the menu list CSV file.
     */
    menuListPath("utilities/data/menu_list.csv"),

    /**
     * Path to the order menu list CSV file.
     */
    ordermenuListPath("utilities/data/ordermenu_list.csv"),

    /**
     * Path to the staff list CSV file.
     */
    staffListPath("utilities/data/staff_list.csv"),

    /**
     * Path to the staff passwords CSV file.
     */
    staffPasswordsPath("utilities/data/staff_passwords.csv"),

    /**
     * Path to the payment list CSV file.
     */
    paymentListPath("entities/data/payment_list.csv");

    private final String path;

    /**
     * Constructs a new FilePaths enum constant with the specified file path.
     *
     * @param path The file path associated with the enum constant.
     */
    FilePaths(String path) {
        this.path = path;
    }

    /**
     * Gets the file path associated with this enum constant.
     *
     * @return The file path.
     */
    public String getPath() {
        return this.path;
    }
}
