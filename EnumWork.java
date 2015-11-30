
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
                y += 1;
                break;
            case SOUTH:
                y -= 1;
                break;
            case EAST:
                x += 1;
                break;
            case WEST:
                x -= 1;
                break;
            case NORTHWEST:
                y += 1;
                x -= 1;
                break;
            case NORTHEAST:
                y += 1;
                x += 1;
            case SOUTHWEST:
                y -= 1;
                x -= 1;
            case SOUTHEAST:
                y -= 1;
                x += 1;
        }
        return (x,y)
    }
}

