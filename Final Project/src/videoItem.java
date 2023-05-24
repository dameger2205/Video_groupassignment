class videoItem extends Item {
    private String genres;
    public videoItem(String id, String title, String rentalType, String loanType, int numberOfCopies, double rentalFee, String rentalStatus) {
        super(id, title, rentalType, loanType, numberOfCopies, rentalFee, rentalStatus);
    }

    public String getGenre(){
        return genres;
    }
    public void setGenre(String genres){
        String[] availableGenre = {"Action", "Horror", "Drama", "Comedy"};
        boolean matched = false;
        for (String genre:availableGenre){
            if (genres.equals(genre)){
                matched = true;
            }
        }
        if (matched)
            this.genres = genres;
        else
            System.out.println("Error genre") ;
    }
}



