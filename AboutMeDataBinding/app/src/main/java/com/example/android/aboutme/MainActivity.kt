val database = FirebaseDatabase.getInstance().getReference("orders")

database.addChildEventListener(object : ChildEventListener {
    override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
        val newOrder = snapshot.getValue(Order::class.java)
        if (newOrder != null) {
            showOrderDialog(newOrder) // Trigger sound and popup for Grace Food Plaza staff
        }
    }
    // ... other overrides
})
