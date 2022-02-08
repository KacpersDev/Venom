# Venom

> Venom is an API, which will make your life easier. It has a lot of superlatives, such as.
> Inventories
> Items
> Messages
> Server Information 

# Maven

## Repository

```yaml
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
```

## Dependency

```yaml
        <dependency>
            <groupId>com.github.KacpersDev</groupId>
            <artifactId>Venom</artifactId>
            <version>f825814824</version>
        </dependency>
```

# Gradle

## Repository

```yaml
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

## Dependency

```yaml

dependencies {
	       implementation 'com.github.KacpersDev:Venom:16793ac6f7'
}

```

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

## Creating an Inventory

```java
public class Test implements Listener {

    private final Venom venom = new Venom();
    private Inventory inventory;

    @EventHandler
    public void onMove(PlayerMoveEvent event){

        Player player = event.getPlayer();

        venom.getVenomInventory().createInventory(player, inventory, "inventory name", 54, true);

    }

}
```

## Server Informations

```java
public class Test implements Listener {

    private final Venom venom = new Venom();

    @EventHandler
    public void onMove(PlayerMoveEvent event){

        Player player = event.getPlayer();
        
        player.sendMessage(venom.getApi().getServerName());
        player.sendMessage(String.valueOf(venom.getApi().getOnlinePlayers()));
        player.sendMessage(String.valueOf(venom.getApi().getMaxPlayers()));
        player.sendMessage(String.valueOf(venom.getApi().isServerWhitelisted()));

    }

}
```
