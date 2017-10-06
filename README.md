# Tuto Showcase

A simple and Elegant Showcase view for Android


```java
TutoShowcase.from(this)
    .setContentView(R.layout.tuto_sample)

    .on(R.id.about) //a view in actionbar
    .addCircle()
    .withBorder()
    .onClick(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //custom action
        }
    })

    .on(R.id.swipable)
    .displaySwipableRight()

    .show();
```


# Tutorial

You can simply limit a showcase visibility to once with `.showOnce(string)`

# Content View

It's simple to add a content view into the TutoShowcase,
you can for example add images or descriptions texts

```java
TutoShowcase.from(this)
    .setContentView(R.layout.tuto_sample)
    ...
    .show()
```


# Indicators

You can higlight some elements to user

## Circle

```java
.on(view)
.addCircle()
.setPadding(10)
.withBorder()
.borderPadding() 
.borderColor(R.color.primary) 
```


## RoundRect

```java
.on(view)
.addRoundRect() // RoundRect with radius default
.addRoundWithRadius(1.5F) 
.addRoundWithoutRadius() 
.setPadding(10)
.withBorder()
.borderPadding()
.borderColor(R.color.primary)
```


# Actions

Some actions can be explained to the user

## Scrollable

```java
.on(view)
.displayScrollable()
```

## Swipable Left

```java
.on(view)
.displaySwipableLeft()
```


## Swipable Right

```java
.on(view)
.displaySwipableRight()
```


# Events

You can listen for indicator click

```java
.on(view)
. //your indicator
.onClick(new View.OnClickListener(){
    public void onClick(View view){``
         //your action
    }
}
```

If you have any clickable view into your content layout 

```java
TutoShowcase.from(this)
    .setContentView(R.layout.tuto_sample)
    .onClickContentView(R.id.clickableView, new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                            
        }
    })
    ...
    .show()
```


# RecyclerView or ListView

```java
listView.postDelayed(new Runnable() {
    @Override
    public void run() {
        TutoShowCase.from(this)
                .setFitsSystemWindows(true)
                .setBackgroundColor(color)
                .setContentView(R.layout.layout_target)
                .on(listView.getChildAt(0).findViewById(targetId))
                .addCircle()
                .show()
                .onClickContentView(R.id.rl_container, null) // disable dismiss
                .onClickContentView(R.id.item, 
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
							// todo
                    }
                });
    }
}, 0);

