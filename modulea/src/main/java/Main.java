import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

public class Main {
   public static void main(String[] args) {
      Cache<Object, Object> cache = Caffeine.newBuilder().build();
      cache.policy().getIfPresentQuietly("bla");
   }
}
