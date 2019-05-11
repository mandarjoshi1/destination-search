package com.destination.serach.model;

public class SearchFilters {
    // this flag is to use only google apis to get area details
    private boolean onlyAreaDetail;
    // filter by category
    private String category;

    public boolean isOnlyAreaDetail() {
        return onlyAreaDetail;
    }

    public void setOnlyAreaDetail(boolean onlyAreaDetail) {
        this.onlyAreaDetail = onlyAreaDetail;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
