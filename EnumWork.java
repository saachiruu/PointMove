
public class EnumWork
{
    private enum Compass {
        NORTH, SOUTH, EAST, WEST, NORTHWEST, NORTHEAST, SOUTHWEST, SOUTHEAST
    }
    
    }
    public Point movePoint (Point oldPt, Compass direction)
    {
        switch {
            case NORTH:
                oldPt.y += 1;
                break;
            case SOUTH:
                oldPt.y -= 1;
                break;
            case EAST:
                oldPt.x += 1;
                break;
            case WEST:
                oldPt.x -= 1;
                break;
            case NORTHWEST:
                oldPt.y += 1;
                oldPt.x -= 1;
                break;
            case NORTHEAST:
                oldPt.y += 1;
                oldPt.x += 1;
            case SOUTHWEST:
                oldPt.y -= 1;
                oldPt.x -= 1;
            case SOUTHEAST:
                oldPt.y -= 1;
                oldPt.x += 1;
        }
        return (x,y);
    }
}

