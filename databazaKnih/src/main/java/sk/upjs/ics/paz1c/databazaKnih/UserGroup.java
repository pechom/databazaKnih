package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

class UserGroup {
    private int id;
    private String name;
    private List<String> privileges;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the privileges
     */
    public List<String> getPrivileges() {
        return privileges;
    }

    /**
     * @param privileges the privileges to set
     */
    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }
    
}
