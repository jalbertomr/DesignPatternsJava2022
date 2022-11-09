package Factory_byAbstractClass;

public abstract class Notification {
   private String channel;
	
   public abstract void notifyUser();

   public String getChannel() {
	  return channel;
   }

   public void setChannel(String channel) {
	  this.channel = channel;
   }
}
