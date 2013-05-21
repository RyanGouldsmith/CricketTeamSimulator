package cricketsim.model;

/**
 * Signals that a Cricketer cannot be matched to one that already exist in the
 * CollectionOfCricketers.
 * @author Ryan Gouldsmith (ryangouldsmith@gmail.com)
 * @author Josh Tumath (josh@joshtumath.me.uk)
 */
public class CricketerNotFoundException extends Exception {
	private static final long serialVersionUID = 6293727980279543862L;

	CricketerNotFoundException () {
		super();
	}
}
