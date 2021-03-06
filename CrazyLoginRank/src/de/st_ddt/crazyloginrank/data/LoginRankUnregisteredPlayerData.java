package de.st_ddt.crazyloginrank.data;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;

import de.st_ddt.crazyloginrank.CrazyLoginRank;
import de.st_ddt.crazyplugin.data.PlayerData;

public class LoginRankUnregisteredPlayerData extends PlayerData<LoginRankData> implements LoginRankData
{

	protected int rank;

	public LoginRankUnregisteredPlayerData(final String name)
	{
		super(name);
		rank = 0;
	}

	public LoginRankUnregisteredPlayerData(final OfflinePlayer player)
	{
		super(player.getName());
		rank = 0;
	}

	public LoginRankUnregisteredPlayerData(final String name, final int rank)
	{
		super(name);
		this.rank = rank;
	}

	public LoginRankUnregisteredPlayerData(final OfflinePlayer player, final int rank)
	{
		super(player.getName());
		this.rank = rank;
	}

	@Override
	public String getParameter(final CommandSender sender, final int index)
	{
		switch (index)
		{
			case 0:
				return getName();
			case 1:
				return getRank().toString();
			default:
				return "";
		}
	}

	@Override
	public int getParameterCount()
	{
		return 2;
	}

	@Override
	public int compareTo(final LoginRankData o)
	{
		return getRank().compareTo(o.getRank());
	}

	@Override
	public Integer getRank()
	{
		return rank;
	}

	@Override
	public String toString()
	{
		return getName() + " Rank " + getRank().toString();
	}

	public CrazyLoginRank getPlugin()
	{
		return CrazyLoginRank.getPlugin();
	}

	@Override
	protected String getChatHeader()
	{
		return getPlugin().getChatHeader();
	}

	@Override
	public void showDetailed(final CommandSender target, final String chatHeader)
	{
		// EDIT showDetailed
	}
}
