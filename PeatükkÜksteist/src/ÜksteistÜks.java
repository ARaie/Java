

public class ÜksteistÜks {

    // pure

/** Initializes a new instance of <code>Rectangle</code> from the coordinates of the specified rectangle.

       public Rectangle(Rectangle r) {
         x = r.x;
            y = r.y;
            width = r.width;
            height = r.height;
             }
 */

    // pure

 /** Initializes a new instance of <code>Rectangle</code> from the specified inputs.

         public Rectangle(int x, int y, int width, int height){
                 this.x = x;
               this.y = y;
               this.width = width;
              this.height = height;
             }
 */

    // pure

/** Initializes a new instance of <code>Rectangle</code> with the specified
 width and height. The upper left corner of the rectangle will be at
  the origin (0,0).

         public Rectangle(int width, int height){
              this.width = width;
              this.height = height;
                }
 */

    // pure

/** Initializes a new instance of <code>Rectangle</code> with a top-left
 corner represented by the specified point and the width and height
 represented by the specified dimension.

       public Rectangle(Point p, Dimension d){
               x = p.x;
               y = p.y;
               width = d.width;
               height = d.height;
              }
 */

    // pure

/** Initializes a new instance of <code>Rectangle</code> with a top left
 corner at the specified point and a width and height of zero.

         public Rectangle(Point p){
               x = p.x;
               y = p.y;
             }
 */

    // pure

/** Initializes a new instance of <code>Rectangle</code> with an
 upper left corner at the origin (0,0) and a width and height represented
 by the specified dimension.

        public Rectangle(Dimension d){
                width = d.width;
                height = d.height;
            }
 */

    // pure

 /** Get the X coordinate of the upper-left corner.

           public double getX(){
                return x;
              }
  */

    // pure

/** Get the Y coordinate of the upper-left corner.

         public double getY(){
                 return y;
              }
 */

    // pure

/** Get the width of the rectangle.

       public double getWidth(){
                return width;
             }
 */

    // pure

/** Get the height of the rectangle.

          public double getHeight(){
              return height;
            }
 */

    // pure

/** Returns the bounds of this rectangle. A pretty useless method, as this
 is already a rectangle; it is included to mimic the
 <code>getBounds</code> method in Component.

       public Rectangle getBounds(){
                return new Rectangle(this);
              }
 */

    // pure

/** Returns the high-precision bounds of this rectangle. A pretty useless
 method, as this is already a rectangle.

        public Rectangle2D getBounds2D(){
                return new Rectangle(x, y, width, height);
              }
 */

    // modifier

/** Updates this rectangle to match the dimensions of the specified
 rectangle.

        public void setBounds(Rectangle r){
                setBounds (r.x, r.y, r.width, r.height);
             }
 */

    // modifier

/** Updates this rectangle to have the specified dimensions.

       public void setBounds(int x, int y, int width, int height){
                 reshape (x, y, width, height);
              }
 */

    // modifier

/** Updates this rectangle to have the specified dimensions, rounded to the
 integer precision used by this class (the values are rounded "outwards" so
 that the stored rectangle completely encloses the specified double
 precision rectangle).

        public void setRect(double x, double y, double width, double height){
                this.x = (int) Math.floor(x);
                this.y = (int) Math.floor(y);
                this.width = (int) Math.ceil(x + width) - this.x;
                this.height = (int) Math.ceil(y + height) - this.y;
            }
 */

    // modifier

 /** Updates this rectangle to have the specified dimensions.

         public void reshape(int x, int y, int width, int height){
                this.x = x;
                this.y = y;
                this.width = width;
                this.height = height;
             }
  */

        // pure

/** Returns the location of this rectangle, which is the coordinates of
 its upper left corner.

         public Point getLocation(){
                return new Point(x,y);
             }
 */

    // modifier

/** Moves the location of this rectangle by setting its upper left
 corner to the specified point.

           public void setLocation(Point p){
                setLocation (p.x, p.y);
             }
 */

    // modifier

/** Moves the location of this rectangle by setting its upper left
 corner to the specified coordinates.

         public void setLocation(int x, int y){
                move (x, y);
             }
 */

    // modifier

/** Moves the location of this rectangle by setting its upper left
 corner to the specified coordinates.

         public void move(int x, int y){
                this.x = x;
                this.y = y;
             }
 */

    // modifier

/** Translate the location of this rectangle by the given amounts.

         public void translate(int dx, int dy){
               x += dx;
               y += dy;
             }
 */

    // pure

/** Returns the size of this rectangle.

           public Dimension getSize(){
                 return new Dimension(width, height);
              }
 */

    // modifier

/** Sets the size of this rectangle based on the specified dimensions.

          public void setSize(Dimension d){
                setSize (d.width, d.height);
             }
 */

    // modifier

/** Sets the size of this rectangle based on the specified dimensions.

           public void setSize(int width, int height){
                resize (width, height);
            }
 */

    // modifier

/** Sets the size of this rectangle based on the specified dimensions.

        public void resize(int width, int height){
                 this.width = width;
                 this.height = height;
              }
 */

    // pure

/** Tests whether or not the specified point is inside this rectangle.
 According to the contract of Shape, a point on the border is in only if
 it has an adjacent point inside the rectangle in either the increasing
 x or y direction.

           public boolean contains(Point p){
               return contains (p.x, p.y);
            }
 */

    // pure

/** Tests whether or not the specified point is inside this rectangle.
 According to the contract of Shape, a point on the border is in only if
 it has an adjacent point inside the rectangle in either the increasing
 x or y direction.

          public boolean contains(int x, int y){
               return inside (x, y);
            }
 */

    // pure

/** Checks whether all points in the given rectangle are contained in this
 rectangle.

      public boolean contains(Rectangle r){
               return contains (r.x, r.y, r.width, r.height);
              }
 */

    // pure

/** Checks whether all points in the given rectangle are contained in this
 rectangle.

           public boolean contains(int x, int y, int w, int h){
                return width > 0 && height > 0 && w > 0 && h > 0
                   && x >= this.x && x + w <= this.x + this.width
                   && y >= this.y && y + h <= this.y + this.height;
            }
 */

    // pure

/** Tests whether or not the specified point is inside this rectangle.

         public boolean inside(int x, int y){
               return width > 0 && height > 0
                 && x >= this.x && x < this.x + width
                 && y >= this.y && y < this.y + height;
            }
 */

    // pure

/** Tests whether or not the specified rectangle intersects this rectangle.
 This means the two rectangles share at least one internal point.

          public boolean intersects(Rectangle r){
                return r.width > 0 && r.height > 0 && width > 0 && height > 0
                   && r.x < x + width && r.x + r.width > x
                   && r.y < y + height && r.y + r.height > y;
              }
 */

    // pure

/** Determines the rectangle which is formed by the intersection of this
 rectangle with the specified rectangle. If the two do not intersect,
 an empty rectangle will be returned (meaning the width and/or height
 will be non-positive).

          public Rectangle intersection(Rectangle r){
                Rectangle res = new Rectangle();
                intersect(this, r, res);
                return res;
             }
 */

    // pure

/** Returns the smallest rectangle that contains both this rectangle
 and the specified rectangle.

          public Rectangle union(Rectangle r){
                Rectangle res = new Rectangle();
                union(this, r, res);
                return res;
            }
 */

    // modifier

/** Modifies this rectangle so that it represents the smallest rectangle
 that contains both the existing rectangle and the specified point.
 However, if the point falls on one of the two borders which are not
 inside the rectangle, a subsequent call to <code>contains</code> may
 return false.

         public void add(int x, int y){
                add((double) x, (double) y);
            }
 */

    // modifier

/** Modifies this rectangle so that it represents the smallest rectangle
 that contains both the existing rectangle and the specified point.
 However, if the point falls on one of the two borders which are not
 inside the rectangle, a subsequent call to <code>contains</code> may
 return false.

           public void add(Point p){
                add((double) p.x, (double) p.y);
               }
 */

    // modifier

/** Modifies this rectangle so that it represents the smallest rectangle
 that contains both the existing rectangle and the specified rectangle.

         public void add(Rectangle r){
                union(this, r, this);
            }
 */

    // modifier

/** Expands the rectangle by the specified amount.  The horizontal
 and vertical expansion values are applied both to the X,Y coordinate
 of this rectangle, and its width and height.  Thus the width and
 height will increase by 2h and 2v accordingly.

           public void grow(int h, int v){
                x -= h;
                y -= v;
                width += h + h;
                height += v + v;
             }
 */

    // pure

/** Tests whether or not this rectangle is empty.  An empty rectangle
 has a non-positive width or height.

         public boolean isEmpty(){
               return width <= 0 || height <= 0;
            }
 */

    // pure

/** Determine where the point lies with respect to this rectangle. The
 result will be the binary OR of the appropriate bit masks.

        public int outcode(double x, double y){
                 int result = 0;
                 if (width <= 0)
                       result |= OUT_LEFT | OUT_RIGHT;
                 else if (x < this.x)
                       result |= OUT_LEFT;
                 else if (x > this.x + width)
                       result |= OUT_RIGHT;
                 if (height <= 0)
                       result |= OUT_BOTTOM | OUT_TOP;
                 else if (y < this.y) // Remember that +y heads top-to-bottom.
                       result |= OUT_TOP;
                 else if (y > this.y + height)
                       result |= OUT_BOTTOM;
                 return result;
               }
 */

    // pure

/** Determines the rectangle which is formed by the intersection of this
 rectangle with the specified rectangle. If the two do not intersect,
 an empty rectangle will be returned (meaning the width and/or height
 will be non-positive).

         public Rectangle2D createIntersection(Rectangle2D r){
                // Favor runtime type of other rectangle.
                Rectangle2D res = r.getBounds2D();
                intersect(this, r, res);
                return res;
             }
 */

    // pure

/** Returns the smallest rectangle that contains both this rectangle
 and the specified rectangle.

          public Rectangle2D createUnion(Rectangle2D r){
                // Favor runtime type of other rectangle.
                Rectangle2D res = r.getBounds2D();
                union(this, r, res);
                return res;
             }
 */

    // pure

/** Tests this rectangle for equality against the specified object.  This
 will be true if an only if the specified object is an instance of
 Rectangle2D with the same coordinates and dimensions.

           public boolean equals(Object obj){
                 // NOTE: No special hashCode() method is required for this class,
                 // as this equals() implementation is functionally equivalent to
                // super.equals(), which does define a proper hashCode().

                 if (! (obj instanceof Rectangle2D))
                       return false;
                 Rectangle2D r = (Rectangle2D) obj;
                 return r.getX() == x && r.getY() == y
                   && r.getWidth() == width && r.getHeight() == height;
               }
 */

    // pure

/** Returns a string representation of this rectangle. This is in the form
 <code>getClass().getName() + "[x=" + x + ",y=" + y + ",width=" + width
 + ",height=" + height + ']'</code>.

           public String toString(){
                 return getClass().getName() + "[x=" + x + ",y=" + y + ",width=" + width
                  + ",height=" + height + ']';
               }
 */

}
