interface LibraryUser {
    String getUserType();
    void borrowMedia(Media media);
    void returnMedia(Media media);
    int getMaxBorrowLimit();
}
