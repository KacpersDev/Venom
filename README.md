# Venom

> Venom is an API, which will make your life easier. It has a lot of superlatives, such as.
> Inventories
> Items
> Messages
> Server Information 

# Usage

## Sending a Message

```java
public class Test implements Listener {

    private final Venom venom = new Venom();

    @EventHandler
    public void onMove(PlayerMoveEvent event){

        Player player = event.getPlayer();

        player.sendMessage(venom.getCC().translate("&aThis is a test message"));

    }

}

```
