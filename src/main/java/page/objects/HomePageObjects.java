package page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageObjects {

    @AndroidFindBy(accessibility = "Bookmarked Playlists")
    public MobileElement bookmarkIcon;

    @AndroidFindBy(id = "org.schabi.newpipe:id/empty_state_view")
    public MobileElement nothingHereButCricket;

}
