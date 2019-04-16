package com.example.pollsapplication.model;

public class Role
{
    private Long id;
    private RoleName name;

    public Role()
    {
    }

    public Role( final RoleName name)
    {
        this.name = name;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(final Long id)
    {
        this.id = id;
    }

    public RoleName getName()
    {
        return name;
    }

    public void setName(final RoleName name)
    {
        this.name = name;
    }
}
