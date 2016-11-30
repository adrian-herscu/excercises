/**
 * 
 */
package exercises.extra;

/**
 * 
 *
 * @author aherscu
 *
 */
public class BiNode {
    public final String value;
    public final BiNode left, right;

    public BiNode(String value, BiNode left, BiNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BiNode(String value, BiNode left) {
        this(value, left, null);
    }

    public BiNode(String value) {
        this(value, null);
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object)
            return true;

        if (object instanceof BiNode) {
            final BiNode node = (BiNode) object;
            return value.equals(node.value)
                && left != null && left.equals(node.left)
                && right != null && right.equals(node.right);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return value.hashCode()
            ^ (left != null ? left.hashCode() : 0)
            ^ (right != null ? right.hashCode() : 0);
    }
}
