# RecyclerViewResearch

I. RecyclerView with multiple items

Source: https://android.jlelse.eu/a-recyclerview-with-multiple-item-types-dfba3979050

+ Create an interface for data model which has a "getType()" method for each model.
+ Create an abstract class ViewRenderer for base view render.
+ Create a GlobalAdapter standing for base adapter (extends RecyclerView.Adapter). Our GlobalAdapter contains a ArrayList of model interfaces,
a SparseArray of ViewRenderer. Register renderer type to list ViewRenderer.
+ To implement an Item to put to list: Create model class implement data model interface, create a holder for this item and a renderer extending ViewRenderer.
Finally, register the custom renderer to adapter.

II. ViewBinder in RecyclerView

Source: https://android.jlelse.eu/simplifying-the-work-with-recyclerview-a64027bca8c3

+ No need to create ViewHolder each time and create variables for views;
+ No need to create ViewRenderer each time and write extra code;
+ No need to rename anything when changing the view ID;
+ All the data about the view (layoutID, concreteViewID, cast) are in one place.
