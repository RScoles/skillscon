
public static ArrayList<HashMap<String, String>> findByValue(String value) {
        // load data, if not already loaded
        loadData();

        // To hold string keys and the values
        ArrayList<HashMap<String, String>> someJobs = new ArrayList<>();

        // loops to go over all items in list
        for (int i = 0; allJobs.size() > i; i++) {
            // Gets the HashMap at i index in allJobs list
            HashMap<String, String> rows = allJobs.get(i);
            // loops over each entry in the rows (employer, location, etc.)
            for (Map.Entry<String, String> row : rows.entrySet()) {
                // Grabs an item to compare to searched item
                String aValue = row.getValue();
                // Convert both values to lowercase for case-insensitive comparison
                if (aValue.toLowerCase().contains(value.toLowerCase())) {
                    // Don't want duplicate rows
                    if (!someJobs.contains(rows)) {
                        // add the whole row of found item
                        someJobs.add(rows);
                    }
                }
            }
        }
        // sends everything back to get printed to console
        return someJobs;
    }